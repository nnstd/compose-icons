package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleFemale: ImageVector
    get() {
        if (_HumanMaleFemale != null) {
            return _HumanMaleFemale!!
        }
        _HumanMaleFemale = ImageVector.Builder(
            name = "HumanMaleFemale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 2f)
                moveTo(6f, 7f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(22f)
                horizontalLineTo(5.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                moveTo(16.5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 2f)
                moveTo(15f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                lineTo(14.59f, 8.41f)
                curveTo(14.84f, 7.59f, 15.6f, 7f, 16.5f, 7f)
                curveTo(17.4f, 7f, 18.16f, 7.59f, 18.41f, 8.41f)
                lineTo(21f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _HumanMaleFemale!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleFemale: ImageVector? = null
