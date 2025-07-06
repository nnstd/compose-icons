package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Kettlebell: ImageVector
    get() {
        if (_Kettlebell != null) {
            return _Kettlebell!!
        }
        _Kettlebell = ImageVector.Builder(
            name = "Kettlebell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.2f, 10.7f)
                lineTo(16.8f, 8.3f)
                curveTo(16.9f, 8f, 17.3f, 6.6f, 16.5f, 5.4f)
                curveTo(15.9f, 4.5f, 14.7f, 4f, 13f, 4f)
                horizontalLineTo(11f)
                curveTo(9.3f, 4f, 8.1f, 4.5f, 7.5f, 5.4f)
                curveTo(6.7f, 6.6f, 7.1f, 7.9f, 7.2f, 8.3f)
                lineTo(7.8f, 10.7f)
                curveTo(6.7f, 11.8f, 6f, 13.3f, 6f, 15f)
                curveTo(6f, 17.1f, 7.1f, 18.9f, 8.7f, 20f)
                horizontalLineTo(15.3f)
                curveTo(16.9f, 18.9f, 18f, 17.1f, 18f, 15f)
                curveTo(18f, 13.3f, 17.3f, 11.8f, 16.2f, 10.7f)
                moveTo(9.6f, 9.5f)
                lineTo(9.1f, 7.8f)
                verticalLineTo(7.7f)
                curveTo(9.1f, 7.7f, 8.9f, 7f, 9.2f, 6.6f)
                curveTo(9.4f, 6.2f, 10f, 6f, 11f, 6f)
                horizontalLineTo(13f)
                curveTo(13.9f, 6f, 14.6f, 6.2f, 14.9f, 6.5f)
                curveTo(15.2f, 6.9f, 15f, 7.6f, 15f, 7.6f)
                lineTo(14.5f, 9.5f)
                curveTo(13.7f, 9.2f, 12.9f, 9f, 12f, 9f)
                curveTo(11.1f, 9f, 10.3f, 9.2f, 9.6f, 9.5f)
                close()
            }
        }.build()

        return _Kettlebell!!
    }

@Suppress("ObjectPropertyName")
private var _Kettlebell: ImageVector? = null
