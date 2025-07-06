package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hours12: ImageVector
    get() {
        if (_Hours12 != null) {
            return _Hours12!!
        }
        _Hours12 = ImageVector.Builder(
            name = "Hours12",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                verticalLineTo(4f)
                curveTo(17f, 4.5f, 20f, 7.8f, 20f, 11.9f)
                curveTo(20f, 15.1f, 18.1f, 17.9f, 15.3f, 19.2f)
                lineTo(13f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                lineTo(16.8f, 20.8f)
                curveTo(19.9f, 19.1f, 22f, 15.8f, 22f, 12f)
                curveTo(22f, 6.8f, 18f, 2.5f, 13f, 2f)
                moveTo(11f, 2f)
                curveTo(9.1f, 2.2f, 7.2f, 3f, 5.7f, 4.2f)
                lineTo(7.1f, 5.6f)
                curveTo(8.2f, 4.8f, 9.6f, 4.2f, 11f, 4f)
                verticalLineTo(2f)
                moveTo(4.2f, 5.7f)
                curveTo(3f, 7.2f, 2.2f, 9.1f, 2f, 11f)
                horizontalLineTo(4f)
                curveTo(4.2f, 9.6f, 4.8f, 8.2f, 5.6f, 7.1f)
                lineTo(4.2f, 5.7f)
                moveTo(2f, 13f)
                curveTo(2.2f, 14.9f, 3f, 16.8f, 4.2f, 18.3f)
                lineTo(5.6f, 16.9f)
                curveTo(4.8f, 15.8f, 4.2f, 14.4f, 4f, 13f)
                horizontalLineTo(2f)
                moveTo(7.1f, 18.4f)
                lineTo(5.7f, 19.8f)
                curveTo(7.2f, 21f, 9.1f, 21.8f, 11f, 22f)
                verticalLineTo(20f)
                curveTo(9.6f, 19.8f, 8.2f, 19.2f, 7.1f, 18.4f)
                moveTo(12f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                curveTo(12.9f, 11f, 12f, 11.9f, 12f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                curveTo(16.1f, 13f, 17f, 12.1f, 17f, 11f)
                verticalLineTo(10f)
                curveTo(17f, 8.9f, 16.1f, 8f, 15f, 8f)
                horizontalLineTo(12f)
                moveTo(7f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Hours12!!
    }

@Suppress("ObjectPropertyName")
private var _Hours12: ImageVector? = null
