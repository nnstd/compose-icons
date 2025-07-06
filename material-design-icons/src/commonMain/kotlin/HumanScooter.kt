package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanScooter: ImageVector
    get() {
        if (_HumanScooter != null) {
            return _HumanScooter!!
        }
        _HumanScooter = ImageVector.Builder(
            name = "HumanScooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2.25f)
                curveTo(17.33f, 2.25f, 18f, 2.92f, 18f, 3.75f)
                curveTo(18f, 4.58f, 17.33f, 5.25f, 16.5f, 5.25f)
                curveTo(15.67f, 5.25f, 15f, 4.58f, 15f, 3.75f)
                curveTo(15f, 2.92f, 15.67f, 2.25f, 16.5f, 2.25f)
                moveTo(20f, 18f)
                curveTo(21.11f, 18f, 22f, 18.9f, 22f, 20f)
                curveTo(22f, 21.11f, 21.11f, 22f, 20f, 22f)
                curveTo(19.26f, 22f, 18.61f, 21.6f, 18.27f, 21f)
                horizontalLineTo(8.73f)
                curveTo(8.39f, 21.6f, 7.74f, 22f, 7f, 22f)
                curveTo(5.9f, 22f, 5f, 21.11f, 5f, 20f)
                curveTo(5f, 18.9f, 5.9f, 18f, 7f, 18f)
                curveTo(7.74f, 18f, 8.39f, 18.4f, 8.73f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(13.5f)
                lineTo(9.73f, 11.23f)
                lineTo(6.77f, 14f)
                curveTo(6.36f, 14.37f, 5.73f, 14.34f, 5.35f, 13.94f)
                lineTo(2.28f, 10.65f)
                curveTo(1.91f, 10.24f, 1.93f, 9.61f, 2.33f, 9.23f)
                curveTo(2.74f, 8.86f, 3.37f, 8.88f, 3.74f, 9.28f)
                lineTo(6.13f, 11.84f)
                lineTo(13.26f, 5.2f)
                lineTo(13.3f, 5.18f)
                curveTo(13.72f, 4.82f, 14.35f, 4.88f, 14.71f, 5.3f)
                lineTo(16.97f, 8f)
                horizontalLineTo(20f)
                curveTo(20.55f, 8f, 21f, 8.45f, 21f, 9f)
                curveTo(21f, 9.55f, 20.55f, 10f, 20f, 10f)
                horizontalLineTo(16.5f)
                curveTo(16.15f, 10f, 15.85f, 9.82f, 15.67f, 9.56f)
                lineTo(14.17f, 7.77f)
                lineTo(11.64f, 10.13f)
                lineTo(14.57f, 12.18f)
                horizontalLineTo(14.57f)
                curveTo(14.83f, 12.36f, 15f, 12.66f, 15f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(15.61f)
                curveTo(16.04f, 17.13f, 17.63f, 15.7f, 19.58f, 15.5f)
                lineTo(18.81f, 11f)
                horizontalLineTo(20.31f)
                lineTo(21.39f, 17.34f)
                curveTo(20.97f, 17.12f, 20.5f, 17f, 20f, 17f)
                curveTo(18.69f, 17f, 17.58f, 17.84f, 17.17f, 19f)
                horizontalLineTo(18.27f)
                curveTo(18.61f, 18.4f, 19.26f, 18f, 20f, 18f)
                close()
            }
        }.build()

        return _HumanScooter!!
    }

@Suppress("ObjectPropertyName")
private var _HumanScooter: ImageVector? = null
