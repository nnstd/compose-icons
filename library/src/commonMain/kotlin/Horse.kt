package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Horse: ImageVector
    get() {
        if (_Horse != null) {
            return _Horse!!
        }
        _Horse = ImageVector.Builder(
            name = "Horse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                verticalLineTo(9.5f)
                lineTo(20.5f, 10f)
                lineTo(18.96f, 7.54f)
                curveTo(18.83f, 7.33f, 18.5f, 7.42f, 18.5f, 7.67f)
                verticalLineTo(11.25f)
                curveTo(18.5f, 12.23f, 18.11f, 13.11f, 17.5f, 13.78f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                curveTo(14.92f, 15f, 14.84f, 15f, 14.75f, 15f)
                curveTo(14.54f, 15f, 14.33f, 14.97f, 14.13f, 14.94f)
                lineTo(9.69f, 14.2f)
                lineTo(8.57f, 16.21f)
                lineTo(9.53f, 21f)
                horizontalLineTo(7f)
                lineTo(6f, 16.25f)
                curveTo(5.97f, 15.95f, 6f, 15.65f, 6.16f, 15.39f)
                lineTo(7.18f, 13.58f)
                curveTo(6.2f, 13.03f, 5.53f, 12f, 5.5f, 10.81f)
                curveTo(5.46f, 10.96f, 5.44f, 11.18f, 5.47f, 11.5f)
                curveTo(5.5f, 11.94f, 5.61f, 12.59f, 5.54f, 13.31f)
                curveTo(5.5f, 14.03f, 5.17f, 14.77f, 4.75f, 15.26f)
                curveTo(4.32f, 15.75f, 3.85f, 16.09f, 3.35f, 16.35f)
                lineTo(2.65f, 15.65f)
                curveTo(2.84f, 15.18f, 3.03f, 14.76f, 3.07f, 14.37f)
                curveTo(3.13f, 14f, 3.06f, 13.7f, 2.95f, 13.43f)
                lineTo(2.42f, 12.3f)
                curveTo(2.21f, 11.79f, 1.95f, 11.05f, 2f, 10.18f)
                curveTo(2.03f, 9.33f, 2.5f, 8.22f, 3.39f, 7.61f)
                curveTo(4.29f, 7f, 5.26f, 6.92f, 6.05f, 7.08f)
                curveTo(6.55f, 7.18f, 7.06f, 7.42f, 7.5f, 7.76f)
                curveTo(7.87f, 7.59f, 8.3f, 7.5f, 8.75f, 7.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(7f)
                curveTo(14.5f, 4.79f, 16.29f, 3f, 18.5f, 3f)
                horizontalLineTo(22f)
                lineTo(21.11f, 4.34f)
                curveTo(21.65f, 4.7f, 22f, 5.31f, 22f, 6f)
                close()
            }
        }.build()

        return _Horse!!
    }

@Suppress("ObjectPropertyName")
private var _Horse: ImageVector? = null
