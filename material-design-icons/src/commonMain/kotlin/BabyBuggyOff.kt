package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyBuggyOff: ImageVector
    get() {
        if (_BabyBuggyOff != null) {
            return _BabyBuggyOff!!
        }
        _BabyBuggyOff = ImageVector.Builder(
            name = "BabyBuggyOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20f)
                curveTo(17f, 21.11f, 16.11f, 22f, 15f, 22f)
                reflectiveCurveTo(13f, 21.11f, 13f, 20f)
                reflectiveCurveTo(13.9f, 18f, 15f, 18f)
                reflectiveCurveTo(17f, 18.9f, 17f, 20f)
                moveTo(5f, 18f)
                curveTo(3.9f, 18f, 3f, 18.9f, 3f, 20f)
                reflectiveCurveTo(3.9f, 22f, 5f, 22f)
                reflectiveCurveTo(7f, 21.11f, 7f, 20f)
                reflectiveCurveTo(6.11f, 18f, 5f, 18f)
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(9.28f, 11.17f)
                lineTo(5.71f, 15.35f)
                curveTo(5.16f, 16f, 5.62f, 17f, 6.47f, 17f)
                horizontalLineTo(14f)
                curveTo(14.32f, 17f, 14.62f, 16.92f, 14.89f, 16.78f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(16f, 12.8f)
                verticalLineTo(6.38f)
                curveTo(16.58f, 5.7f, 16.93f, 5f, 17.61f, 5f)
                curveTo(18.38f, 5f, 19f, 5.66f, 19f, 6.5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(6.5f)
                curveTo(21f, 4.56f, 19.5f, 3f, 17.61f, 3f)
                curveTo(16.95f, 3f, 16.44f, 3.2f, 16f, 3.5f)
                curveTo(15.32f, 3.91f, 14.88f, 4.59f, 14.47f, 5.07f)
                lineTo(11.62f, 8.42f)
                lineTo(16f, 12.8f)
                moveTo(12.32f, 5.1f)
                curveTo(12.59f, 4.78f, 12.91f, 4.38f, 13.3f, 4f)
                curveTo(12.14f, 3.45f, 10.9f, 3.15f, 9.65f, 3.09f)
                curveTo(9.39f, 3.08f, 9.12f, 3.08f, 8.86f, 3.09f)
                curveTo(8.12f, 3.12f, 7.38f, 3.26f, 6.66f, 3.46f)
                lineTo(10.47f, 7.27f)
                lineTo(12.32f, 5.1f)
                close()
            }
        }.build()

        return _BabyBuggyOff!!
    }

@Suppress("ObjectPropertyName")
private var _BabyBuggyOff: ImageVector? = null
