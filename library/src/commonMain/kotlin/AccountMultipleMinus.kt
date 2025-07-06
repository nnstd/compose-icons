package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMultipleMinus: ImageVector
    get() {
        if (_AccountMultipleMinus != null) {
            return _AccountMultipleMinus!!
        }
        _AccountMultipleMinus = ImageVector.Builder(
            name = "AccountMultipleMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                reflectiveCurveTo(7f, 13f, 13f, 13f)
                reflectiveCurveTo(19f, 17f, 19f, 17f)
                moveTo(16f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                moveTo(19.2f, 13.06f)
                arcTo(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(24f)
                verticalLineTo(17f)
                reflectiveCurveTo(24f, 13.55f, 19.2f, 13.06f)
                moveTo(18f, 5f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.11f, 5.14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.11f, 10.86f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5f)
                moveTo(8f, 10f)
                horizontalLineTo(0f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _AccountMultipleMinus!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMultipleMinus: ImageVector? = null
