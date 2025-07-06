package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CityVariantOutline: ImageVector
    get() {
        if (_CityVariantOutline != null) {
            return _CityVariantOutline!!
        }
        _CityVariantOutline = ImageVector.Builder(
            name = "CityVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 23f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(23f)
                moveTo(19f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                moveTo(15f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(23f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                moveTo(7f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                moveTo(19f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(15f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(21f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 11f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _CityVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CityVariantOutline: ImageVector? = null
