package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaletteSwatch: ImageVector
    get() {
        if (_PaletteSwatch != null) {
            return _PaletteSwatch!!
        }
        _PaletteSwatch = ImageVector.Builder(
            name = "PaletteSwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.53f, 19.65f)
                lineTo(3.87f, 20.21f)
                verticalLineTo(11.18f)
                lineTo(1.44f, 17.04f)
                curveTo(1.03f, 18.06f, 1.5f, 19.23f, 2.53f, 19.65f)
                moveTo(22.03f, 15.95f)
                lineTo(17.07f, 4f)
                curveTo(16.76f, 3.23f, 16.03f, 2.77f, 15.26f, 2.75f)
                curveTo(15f, 2.75f, 14.73f, 2.79f, 14.47f, 2.9f)
                lineTo(7.1f, 5.95f)
                curveTo(6.35f, 6.26f, 5.89f, 7f, 5.87f, 7.75f)
                curveTo(5.86f, 8f, 5.91f, 8.29f, 6f, 8.55f)
                lineTo(11f, 20.5f)
                curveTo(11.29f, 21.28f, 12.03f, 21.74f, 12.81f, 21.75f)
                curveTo(13.07f, 21.75f, 13.33f, 21.7f, 13.58f, 21.6f)
                lineTo(20.94f, 18.55f)
                curveTo(21.96f, 18.13f, 22.45f, 16.96f, 22.03f, 15.95f)
                moveTo(7.88f, 8.75f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.88f, 7.75f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.88f, 6.75f)
                curveTo(8.43f, 6.75f, 8.88f, 7.2f, 8.88f, 7.75f)
                curveTo(8.88f, 8.3f, 8.43f, 8.75f, 7.88f, 8.75f)
                moveTo(5.88f, 19.75f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.88f, 21.75f)
                horizontalLineTo(9.33f)
                lineTo(5.88f, 13.41f)
                verticalLineTo(19.75f)
                close()
            }
        }.build()

        return _PaletteSwatch!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteSwatch: ImageVector? = null
