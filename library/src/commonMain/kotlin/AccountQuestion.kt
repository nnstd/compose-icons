package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountQuestion: ImageVector
    get() {
        if (_AccountQuestion != null) {
            return _AccountQuestion!!
        }
        _AccountQuestion = ImageVector.Builder(
            name = "AccountQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8f)
                moveTo(17f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                curveTo(1f, 15.79f, 4.58f, 14f, 9f, 14f)
                curveTo(13.42f, 14f, 17f, 15.79f, 17f, 18f)
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
                close()
            }
        }.build()

        return _AccountQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _AccountQuestion: ImageVector? = null
