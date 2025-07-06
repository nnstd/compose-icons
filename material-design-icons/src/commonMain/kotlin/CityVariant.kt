package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CityVariant: ImageVector
    get() {
        if (_CityVariant != null) {
            return _CityVariant!!
        }
        _CityVariant = ImageVector.Builder(
            name = "CityVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                moveTo(8f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                moveTo(14f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(14f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(13f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(18f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                moveTo(18f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _CityVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CityVariant: ImageVector? = null
