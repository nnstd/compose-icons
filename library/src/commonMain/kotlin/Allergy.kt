package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Allergy: ImageVector
    get() {
        if (_Allergy != null) {
            return _Allergy!!
        }
        _Allergy = ImageVector.Builder(
            name = "Allergy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.75f, 5.33f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 6.58f)
                verticalLineTo(11.17f)
                horizontalLineTo(17.67f)
                verticalLineTo(4.08f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.17f, 4.08f)
                verticalLineTo(11.17f)
                horizontalLineTo(14.33f)
                verticalLineTo(3.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.83f, 3.25f)
                verticalLineTo(11.17f)
                horizontalLineTo(11f)
                verticalLineTo(5.33f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 5.33f)
                verticalLineTo(15.26f)
                lineTo(4.91f, 13.26f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.41f, 13.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 13.37f)
                lineTo(2.67f, 14.37f)
                lineTo(9.21f, 21f)
                arcTo(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.58f, 22f)
                horizontalLineTo(17.67f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.67f)
                verticalLineTo(6.58f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.75f, 5.33f)
                moveTo(11f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15f)
                moveTo(13f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18f)
                moveTo(18f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16f)
                moveTo(17f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19f)
                moveTo(15f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15f)
                close()
            }
        }.build()

        return _Allergy!!
    }

@Suppress("ObjectPropertyName")
private var _Allergy: ImageVector? = null
