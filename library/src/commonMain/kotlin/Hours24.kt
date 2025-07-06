package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hours24: ImageVector
    get() {
        if (_Hours24 != null) {
            return _Hours24!!
        }
        _Hours24 = ImageVector.Builder(
            name = "Hours24",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                verticalLineTo(4.07f)
                curveTo(16.95f, 4.56f, 20f, 7.92f, 20f, 12f)
                curveTo(20f, 15.21f, 18.08f, 18f, 15.28f, 19.28f)
                lineTo(13f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                lineTo(16.78f, 20.78f)
                curveTo(19.91f, 19.07f, 22f, 15.76f, 22f, 12f)
                curveTo(22f, 6.82f, 18.05f, 2.55f, 13f, 2.05f)
                moveTo(11f, 2f)
                curveTo(9.05f, 2.2f, 7.2f, 2.96f, 5.68f, 4.21f)
                lineTo(7.1f, 5.63f)
                curveTo(8.23f, 4.75f, 9.58f, 4.2f, 11f, 4f)
                verticalLineTo(2f)
                moveTo(4.2f, 5.68f)
                curveTo(2.96f, 7.2f, 2.2f, 9.05f, 2f, 11f)
                horizontalLineTo(4f)
                curveTo(4.19f, 9.58f, 4.75f, 8.23f, 5.63f, 7.1f)
                lineTo(4.2f, 5.68f)
                moveTo(6f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                curveTo(6.9f, 11f, 6f, 11.9f, 6f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                curveTo(10.11f, 13f, 11f, 12.11f, 11f, 11f)
                verticalLineTo(10f)
                curveTo(11f, 8.9f, 10.11f, 8f, 9f, 8f)
                horizontalLineTo(6f)
                moveTo(12f, 8f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                moveTo(2f, 13f)
                curveTo(2.2f, 14.95f, 2.97f, 16.8f, 4.22f, 18.32f)
                lineTo(5.64f, 16.9f)
                curveTo(4.76f, 15.77f, 4.2f, 14.42f, 4f, 13f)
                horizontalLineTo(2f)
                moveTo(7.11f, 18.37f)
                lineTo(5.68f, 19.79f)
                curveTo(7.2f, 21.03f, 9.05f, 21.8f, 11f, 22f)
                verticalLineTo(20f)
                curveTo(9.58f, 19.81f, 8.24f, 19.25f, 7.11f, 18.37f)
                close()
            }
        }.build()

        return _Hours24!!
    }

@Suppress("ObjectPropertyName")
private var _Hours24: ImageVector? = null
