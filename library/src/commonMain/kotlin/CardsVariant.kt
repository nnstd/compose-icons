package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsVariant: ImageVector
    get() {
        if (_CardsVariant != null) {
            return _CardsVariant!!
        }
        _CardsVariant = ImageVector.Builder(
            name = "CardsVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 3f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                moveTo(6f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                moveTo(20f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _CardsVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CardsVariant: ImageVector? = null
