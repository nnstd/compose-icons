package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CastEducation: ImageVector
    get() {
        if (_CastEducation != null) {
            return _CastEducation!!
        }
        _CastEducation = ImageVector.Builder(
            name = "CastEducation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                moveTo(1f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 18f)
                moveTo(1f, 14f)
                verticalLineTo(16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21f)
                horizontalLineTo(8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 14f)
                moveTo(1f, 10f)
                verticalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                horizontalLineTo(12f)
                curveTo(12f, 14.92f, 7.07f, 10f, 1f, 10f)
                moveTo(11f, 11.09f)
                verticalLineTo(13.09f)
                lineTo(14.5f, 15f)
                lineTo(18f, 13.09f)
                verticalLineTo(11.09f)
                lineTo(14.5f, 13f)
                lineTo(11f, 11.09f)
                moveTo(14.5f, 6f)
                lineTo(9f, 9f)
                lineTo(14.5f, 12f)
                lineTo(20f, 9f)
                lineTo(14.5f, 6f)
                close()
            }
        }.build()

        return _CastEducation!!
    }

@Suppress("ObjectPropertyName")
private var _CastEducation: ImageVector? = null
