package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleGirl: ImageVector
    get() {
        if (_HumanMaleGirl != null) {
            return _HumanMaleGirl!!
        }
        _HumanMaleGirl = ImageVector.Builder(
            name = "HumanMaleGirl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 2f)
                moveTo(6f, 7f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(22f)
                horizontalLineTo(5.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                moveTo(14.5f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 12f)
                moveTo(15f, 15f)
                horizontalLineTo(18f)
                lineTo(19.5f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13.5f)
                lineTo(15f, 15f)
                close()
            }
        }.build()

        return _HumanMaleGirl!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleGirl: ImageVector? = null
