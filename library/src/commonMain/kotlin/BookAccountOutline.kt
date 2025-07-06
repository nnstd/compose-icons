package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookAccountOutline: ImageVector
    get() {
        if (_BookAccountOutline != null) {
            return _BookAccountOutline!!
        }
        _BookAccountOutline = ImageVector.Builder(
            name = "BookAccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(18f)
                moveTo(18f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                lineTo(10.5f, 6.7f)
                lineTo(8f, 9f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                moveTo(13f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 11f)
                moveTo(17f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                curveTo(9f, 16.67f, 11.67f, 16f, 13f, 16f)
                reflectiveCurveTo(17f, 16.67f, 17f, 18f)
                verticalLineTo(19f)
            }
        }.build()

        return _BookAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookAccountOutline: ImageVector? = null
