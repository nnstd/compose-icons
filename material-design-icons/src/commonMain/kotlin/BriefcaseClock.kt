package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseClock: ImageVector
    get() {
        if (_BriefcaseClock != null) {
            return _BriefcaseClock!!
        }
        _BriefcaseClock = ImageVector.Builder(
            name = "BriefcaseClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.11f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 1f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 7f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                horizontalLineTo(10.26f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 11.11f)
                moveTo(9f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(19f, 20f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 20f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 20f)
                moveTo(15f, 13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                verticalLineTo(13f)
            }
        }.build()

        return _BriefcaseClock!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseClock: ImageVector? = null
