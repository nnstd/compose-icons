package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cactus: ImageVector
    get() {
        if (_Cactus != null) {
            return _Cactus!!
        }
        _Cactus = ImageVector.Builder(
            name = "Cactus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                verticalLineTo(15f)
                curveTo(8f, 15.56f, 8.45f, 16f, 9f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                verticalLineTo(13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Cactus!!
    }

@Suppress("ObjectPropertyName")
private var _Cactus: ImageVector? = null
