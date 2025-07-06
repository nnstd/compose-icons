package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KettlePourOver: ImageVector
    get() {
        if (_KettlePourOver != null) {
            return _KettlePourOver!!
        }
        _KettlePourOver = ImageVector.Builder(
            name = "KettlePourOver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                curveTo(9.4f, 4f, 9f, 4.4f, 9f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                curveTo(14f, 4.4f, 13.6f, 4f, 13f, 4f)
                horizontalLineTo(10f)
                moveTo(3f, 7f)
                lineTo(4.1f, 14.1f)
                curveTo(4.2f, 14.8f, 4.5f, 15.5f, 5.1f, 16.1f)
                curveTo(5.5f, 16.6f, 6.2f, 16.9f, 7f, 17f)
                curveTo(7f, 17.6f, 7.4f, 18f, 8f, 18f)
                horizontalLineTo(16f)
                curveTo(16.6f, 18f, 17f, 17.6f, 17f, 17f)
                lineTo(15f, 11f)
                horizontalLineTo(17f)
                lineTo(20.3f, 16f)
                lineTo(22f, 15f)
                lineTo(18.7f, 10f)
                lineTo(20f, 9.2f)
                lineTo(19f, 7.5f)
                lineTo(16.4f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                lineTo(7.2f, 16f)
                curveTo(6.5f, 15.9f, 6.1f, 15.7f, 5.8f, 15.4f)
                curveTo(5.4f, 15f, 5.2f, 14.5f, 5.1f, 13.9f)
                lineTo(4f, 7f)
                horizontalLineTo(3f)
                moveTo(4f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _KettlePourOver!!
    }

@Suppress("ObjectPropertyName")
private var _KettlePourOver: ImageVector? = null
