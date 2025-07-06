package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMultipleCheckOutline: ImageVector
    get() {
        if (_AccountMultipleCheckOutline != null) {
            return _AccountMultipleCheckOutline!!
        }
        _AccountMultipleCheckOutline = ImageVector.Builder(
            name = "AccountMultipleCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 11f)
                moveTo(13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                moveTo(17.11f, 10.86f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.11f, 5.14f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.11f, 10.86f)
                moveTo(13f, 13f)
                curveTo(7f, 13f, 7f, 17f, 7f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                reflectiveCurveTo(19f, 13f, 13f, 13f)
                moveTo(9f, 17f)
                curveTo(9f, 16.71f, 9.32f, 15f, 13f, 15f)
                curveTo(16.5f, 15f, 16.94f, 16.56f, 17f, 17f)
                moveTo(24f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                arcTo(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.2f, 13.06f)
                curveTo(24f, 13.55f, 24f, 17f, 24f, 17f)
                moveTo(7.34f, 8.92f)
                lineTo(8.5f, 10.33f)
                lineTo(3.75f, 15.08f)
                lineTo(1f, 12.08f)
                lineTo(2.16f, 10.92f)
                lineTo(3.75f, 12.5f)
                lineTo(7.34f, 8.92f)
            }
        }.build()

        return _AccountMultipleCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMultipleCheckOutline: ImageVector? = null
