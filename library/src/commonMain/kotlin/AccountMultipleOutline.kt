package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMultipleOutline: ImageVector
    get() {
        if (_AccountMultipleOutline != null) {
            return _AccountMultipleOutline!!
        }
        _AccountMultipleOutline = ImageVector.Builder(
            name = "AccountMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.07f, 10.41f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.07f, 4.59f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.07f, 10.41f)
                moveTo(5.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7.5f)
                moveTo(7.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 7.5f)
                moveTo(16f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                reflectiveCurveTo(2f, 13f, 9f, 13f)
                reflectiveCurveTo(16f, 17f, 16f, 17f)
                moveTo(14f, 17f)
                curveTo(13.86f, 16.22f, 12.67f, 15f, 9f, 15f)
                reflectiveCurveTo(4.07f, 16.31f, 4f, 17f)
                moveTo(15.95f, 13f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                reflectiveCurveTo(22f, 13.37f, 15.94f, 13f)
                close()
            }
        }.build()

        return _AccountMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMultipleOutline: ImageVector? = null
