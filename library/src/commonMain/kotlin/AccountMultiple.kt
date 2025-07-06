package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMultiple: ImageVector
    get() {
        if (_AccountMultiple != null) {
            return _AccountMultiple!!
        }
        _AccountMultiple = ImageVector.Builder(
            name = "AccountMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                reflectiveCurveTo(2f, 13f, 9f, 13f)
                reflectiveCurveTo(16f, 17f, 16f, 17f)
                moveTo(12.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 7.5f)
                moveTo(15.94f, 13f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                reflectiveCurveTo(22f, 13.37f, 15.94f, 13f)
                moveTo(15f, 4f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.07f, 4.59f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.07f, 10.41f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                close()
            }
        }.build()

        return _AccountMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMultiple: ImageVector? = null
