package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseClockOutline: ImageVector
    get() {
        if (_BriefcaseClockOutline != null) {
            return _BriefcaseClockOutline!!
        }
        _BriefcaseClockOutline = ImageVector.Builder(
            name = "BriefcaseClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.11f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.42f, 5.59f)
                arcTo(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.42f, 1.58f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 1f)
                horizontalLineTo(9f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.58f, 1.58f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                arcTo(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 5.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 7f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 19.41f)
                arcTo(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                horizontalLineTo(10.26f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 11.11f)
                moveTo(9f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(3f, 18f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(9.68f)
                arcTo(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.29f, 18f)
                moveTo(19f, 20f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 20f)
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                moveTo(15f, 13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                verticalLineTo(13f)
            }
        }.build()

        return _BriefcaseClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseClockOutline: ImageVector? = null
