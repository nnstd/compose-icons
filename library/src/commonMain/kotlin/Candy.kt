package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Candy: ImageVector
    get() {
        if (_Candy != null) {
            return _Candy!!
        }
        _Candy = ImageVector.Builder(
            name = "Candy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 8.46f)
                curveTo(17.5f, 10.42f, 17.5f, 13.58f, 15.54f, 15.54f)
                reflectiveCurveTo(10.42f, 17.5f, 8.47f, 15.54f)
                reflectiveCurveTo(6.5f, 10.42f, 8.47f, 8.46f)
                reflectiveCurveTo(13.58f, 6.5f, 15.54f, 8.46f)
                moveTo(19.47f, 4.55f)
                curveTo(19.47f, 4.55f, 18.5f, 4.67f, 17.43f, 5.36f)
                curveTo(17.28f, 4.32f, 16.78f, 3.27f, 15.93f, 2.42f)
                curveTo(14.68f, 3.66f, 14.53f, 5.22f, 14.83f, 6.34f)
                curveTo(16.22f, 6.7f, 17.3f, 7.78f, 17.66f, 9.17f)
                curveTo(18.78f, 9.47f, 20.34f, 9.32f, 21.58f, 8.07f)
                curveTo(20.74f, 7.23f, 19.71f, 6.74f, 18.68f, 6.58f)
                curveTo(19.07f, 6f, 19.38f, 5.33f, 19.47f, 4.55f)
                moveTo(4.53f, 19.45f)
                curveTo(4.53f, 19.45f, 5.5f, 19.33f, 6.57f, 18.64f)
                curveTo(6.72f, 19.68f, 7.22f, 20.73f, 8.07f, 21.58f)
                curveTo(9.32f, 20.34f, 9.47f, 18.78f, 9.17f, 17.66f)
                curveTo(7.78f, 17.3f, 6.7f, 16.22f, 6.34f, 14.83f)
                curveTo(5.22f, 14.53f, 3.66f, 14.68f, 2.42f, 15.93f)
                curveTo(3.26f, 16.77f, 4.29f, 17.27f, 5.32f, 17.42f)
                curveTo(4.93f, 18f, 4.62f, 18.68f, 4.53f, 19.45f)
                close()
            }
        }.build()

        return _Candy!!
    }

@Suppress("ObjectPropertyName")
private var _Candy: ImageVector? = null
