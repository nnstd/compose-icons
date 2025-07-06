package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmartCardReader: ImageVector
    get() {
        if (_SmartCardReader != null) {
            return _SmartCardReader!!
        }
        _SmartCardReader = ImageVector.Builder(
            name = "SmartCardReader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                horizontalLineTo(5f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                moveTo(8.25f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(8.25f)
                curveTo(9.91f, 6f, 10.75f, 9.34f, 10.75f, 11f)
                reflectiveCurveTo(9.91f, 16f, 8.25f, 16f)
                moveTo(14.5f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 13.5f)
                moveTo(23f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 21f)
                close()
            }
        }.build()

        return _SmartCardReader!!
    }

@Suppress("ObjectPropertyName")
private var _SmartCardReader: ImageVector? = null
