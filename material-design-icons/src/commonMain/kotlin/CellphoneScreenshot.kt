package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneScreenshot: ImageVector
    get() {
        if (_CellphoneScreenshot != null) {
            return _CellphoneScreenshot!!
        }
        _CellphoneScreenshot = ImageVector.Builder(
            name = "CellphoneScreenshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 23f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 1f)
                horizontalLineTo(7f)
                moveTo(7f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                moveTo(9f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                moveTo(13.5f, 14f)
                verticalLineTo(16.5f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()

        return _CellphoneScreenshot!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneScreenshot: ImageVector? = null
