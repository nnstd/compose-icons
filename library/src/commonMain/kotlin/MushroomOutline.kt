package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MushroomOutline: ImageVector
    get() {
        if (_MushroomOutline != null) {
            return _MushroomOutline!!
        }
        _MushroomOutline = ImageVector.Builder(
            name = "MushroomOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 12f)
                horizontalLineTo(20f)
                curveTo(20f, 8.27f, 17.44f, 5.13f, 14f, 4.25f)
                curveTo(13.86f, 5.24f, 13f, 6f, 12f, 6f)
                curveTo(11f, 6f, 10.14f, 5.24f, 10f, 4.25f)
                curveTo(6.56f, 5.13f, 4f, 8.27f, 4f, 12f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(13.5f, 17f)
                horizontalLineTo(10.5f)
                lineTo(9.92f, 19f)
                lineTo(9.65f, 20f)
                horizontalLineTo(14.35f)
                lineTo(14.08f, 19f)
                lineTo(13.5f, 17f)
                moveTo(15f, 15f)
                lineTo(16f, 18.5f)
                lineTo(16.27f, 19.45f)
                lineTo(16.35f, 20f)
                curveTo(16.35f, 21.1f, 15.45f, 22f, 14.35f, 22f)
                horizontalLineTo(9.65f)
                lineTo(9.17f, 21.94f)
                curveTo(8.1f, 21.66f, 7.45f, 20.57f, 7.73f, 19.5f)
                lineTo(8f, 18.5f)
                lineTo(9f, 15f)
                horizontalLineTo(15f)
                moveTo(16f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 7f)
                moveTo(8f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7f)
                close()
            }
        }.build()

        return _MushroomOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MushroomOutline: ImageVector? = null
