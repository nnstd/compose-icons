package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteAlert: ImageVector
    get() {
        if (_DeleteAlert != null) {
            return _DeleteAlert!!
        }
        _DeleteAlert = ImageVector.Builder(
            name = "DeleteAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(6.5f)
                lineTo(7.5f, 3f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 4f)
                horizontalLineTo(17f)
                moveTo(4f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                curveTo(16f, 20.1f, 15.1f, 21f, 14f, 21f)
                horizontalLineTo(6f)
                curveTo(4.9f, 21f, 4f, 20.1f, 4f, 19f)
                moveTo(19f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                moveTo(19f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _DeleteAlert!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteAlert: ImageVector? = null
