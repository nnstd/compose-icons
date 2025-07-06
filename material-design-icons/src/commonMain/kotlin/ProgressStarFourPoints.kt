package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressStarFourPoints: ImageVector
    get() {
        if (_ProgressStarFourPoints != null) {
            return _ProgressStarFourPoints!!
        }
        _ProgressStarFourPoints = ImageVector.Builder(
            name = "ProgressStarFourPoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                verticalLineTo(2f)
                curveTo(17.66f, 2.5f, 21.33f, 6.19f, 21.85f, 10.85f)
                curveTo(22.45f, 16.34f, 18.5f, 21.28f, 13f, 21.88f)
                verticalLineTo(19.88f)
                curveTo(16.64f, 19.43f, 19.5f, 16.56f, 19.96f, 12.92f)
                curveTo(20.5f, 8.53f, 17.39f, 4.54f, 13f, 4f)
                moveTo(5.67f, 4.2f)
                curveTo(7.19f, 2.95f, 9.04f, 2.18f, 11f, 2f)
                verticalLineTo(4.06f)
                curveTo(9.57f, 4.26f, 8.22f, 4.84f, 7.1f, 5.74f)
                lineTo(5.67f, 4.2f)
                moveTo(2.05f, 11f)
                curveTo(2.24f, 9.04f, 3f, 7.19f, 4.26f, 5.67f)
                lineTo(5.69f, 7.1f)
                curveTo(4.8f, 8.23f, 4.24f, 9.58f, 4.05f, 11f)
                horizontalLineTo(2.05f)
                moveTo(4.27f, 18.33f)
                curveTo(3.03f, 16.81f, 2.26f, 14.96f, 2.06f, 13f)
                horizontalLineTo(4.06f)
                curveTo(4.24f, 14.42f, 4.81f, 15.77f, 5.69f, 16.9f)
                lineTo(4.27f, 18.33f)
                moveTo(5.67f, 19.74f)
                lineTo(7.06f, 18.37f)
                horizontalLineTo(7.1f)
                curveTo(8.23f, 19.25f, 9.58f, 19.82f, 11f, 20f)
                verticalLineTo(22f)
                curveTo(9.04f, 21.79f, 7.18f, 21f, 5.67f, 19.74f)
                moveTo(12f, 17f)
                lineTo(13.56f, 13.58f)
                lineTo(17f, 12f)
                lineTo(13.56f, 10.44f)
                lineTo(12f, 7f)
                lineTo(10.43f, 10.44f)
                lineTo(7f, 12f)
                lineTo(10.43f, 13.58f)
                lineTo(12f, 17f)
                close()
            }
        }.build()

        return _ProgressStarFourPoints!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressStarFourPoints: ImageVector? = null
