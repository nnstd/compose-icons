package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pokeball: ImageVector
    get() {
        if (_Pokeball != null) {
            return _Pokeball!!
        }
        _Pokeball = ImageVector.Builder(
            name = "Pokeball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(7.92f, 4f, 4.55f, 7.05f, 4.06f, 11f)
                horizontalLineTo(8.13f)
                curveTo(8.57f, 9.27f, 10.14f, 8f, 12f, 8f)
                curveTo(13.86f, 8f, 15.43f, 9.27f, 15.87f, 11f)
                horizontalLineTo(19.94f)
                curveTo(19.45f, 7.05f, 16.08f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                curveTo(16.08f, 20f, 19.45f, 16.95f, 19.94f, 13f)
                horizontalLineTo(15.87f)
                curveTo(15.43f, 14.73f, 13.86f, 16f, 12f, 16f)
                curveTo(10.14f, 16f, 8.57f, 14.73f, 8.13f, 13f)
                horizontalLineTo(4.06f)
                curveTo(4.55f, 16.95f, 7.92f, 20f, 12f, 20f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _Pokeball!!
    }

@Suppress("ObjectPropertyName")
private var _Pokeball: ImageVector? = null
