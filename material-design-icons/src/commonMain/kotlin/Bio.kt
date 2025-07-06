package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bio: ImageVector
    get() {
        if (_Bio != null) {
            return _Bio!!
        }
        _Bio = ImageVector.Builder(
            name = "Bio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 14f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                moveTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                moveTo(2f, 7f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                lineTo(2f, 7f)
                moveTo(4f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(4f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Bio!!
    }

@Suppress("ObjectPropertyName")
private var _Bio: ImageVector? = null
