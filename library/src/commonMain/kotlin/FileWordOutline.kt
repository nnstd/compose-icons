package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileWordOutline: ImageVector
    get() {
        if (_FileWordOutline != null) {
            return _FileWordOutline!!
        }
        _FileWordOutline = ImageVector.Builder(
            name = "FileWordOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(17.35f, 10f)
                lineTo(15.25f, 19f)
                horizontalLineTo(13.85f)
                lineTo(12.05f, 12.21f)
                lineTo(10.25f, 19f)
                horizontalLineTo(8.85f)
                lineTo(6.65f, 10f)
                horizontalLineTo(8.15f)
                lineTo(9.55f, 16.81f)
                lineTo(11.35f, 10f)
                horizontalLineTo(12.65f)
                lineTo(14.45f, 16.81f)
                lineTo(15.85f, 10f)
                horizontalLineTo(17.35f)
                close()
            }
        }.build()

        return _FileWordOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileWordOutline: ImageVector? = null
