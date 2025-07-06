package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountQuestionOutline: ImageVector
    get() {
        if (_AccountQuestionOutline != null) {
            return _AccountQuestionOutline!!
        }
        _AccountQuestionOutline = ImageVector.Builder(
            name = "AccountQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                moveTo(18.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 9f)
                curveTo(23f, 9.97f, 22.5f, 10.88f, 21.71f, 11.41f)
                lineTo(21.41f, 11.6f)
                curveTo(20.84f, 12f, 20.5f, 12.61f, 20.5f, 13.3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19f)
                verticalLineTo(13.3f)
                curveTo(19f, 12.11f, 19.6f, 11f, 20.59f, 10.35f)
                lineTo(20.88f, 10.16f)
                curveTo(21.27f, 9.9f, 21.5f, 9.47f, 21.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 9f)
                verticalLineTo(9.5f)
                moveTo(9f, 13f)
                curveTo(11.67f, 13f, 17f, 14.34f, 17f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                curveTo(1f, 14.34f, 6.33f, 13f, 9f, 13f)
                moveTo(9f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                moveTo(9f, 14.9f)
                curveTo(6.03f, 14.9f, 2.9f, 16.36f, 2.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(15.1f)
                verticalLineTo(17f)
                curveTo(15.1f, 16.36f, 11.97f, 14.9f, 9f, 14.9f)
                moveTo(9f, 5.9f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.9f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10.1f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.1f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5.9f)
                close()
            }
        }.build()

        return _AccountQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountQuestionOutline: ImageVector? = null
