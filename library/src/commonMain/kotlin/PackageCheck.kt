package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PackageCheck: ImageVector
    get() {
        if (_PackageCheck != null) {
            return _PackageCheck!!
        }
        _PackageCheck = ImageVector.Builder(
            name = "PackageCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                curveTo(5.5f, 3f, 5.1f, 3.2f, 4.8f, 3.6f)
                lineTo(3.5f, 5.2f)
                curveTo(3.2f, 5.6f, 3f, 6f, 3f, 6.5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(13.3f)
                curveTo(13.1f, 20.4f, 13f, 19.7f, 13f, 19f)
                curveTo(13f, 15.7f, 15.7f, 13f, 19f, 13f)
                curveTo(19.7f, 13f, 20.4f, 13.1f, 21f, 13.3f)
                verticalLineTo(6.5f)
                curveTo(21f, 6f, 20.8f, 5.6f, 20.5f, 5.2f)
                lineTo(19.1f, 3.5f)
                curveTo(18.9f, 3.2f, 18.5f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                moveTo(5.9f, 4f)
                horizontalLineTo(17.9f)
                lineTo(18.8f, 5f)
                horizontalLineTo(5.1f)
                lineTo(5.9f, 4f)
                moveTo(6f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(21.3f, 15.8f)
                lineTo(17.7f, 19.4f)
                lineTo(16.1f, 17.8f)
                lineTo(15f, 19f)
                lineTo(17.8f, 22f)
                lineTo(22.6f, 17.2f)
                lineTo(21.3f, 15.8f)
                close()
            }
        }.build()

        return _PackageCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PackageCheck: ImageVector? = null
