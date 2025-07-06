package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmartCardReaderOutline: ImageVector
    get() {
        if (_SmartCardReaderOutline != null) {
            return _SmartCardReaderOutline!!
        }
        _SmartCardReaderOutline = ImageVector.Builder(
            name = "SmartCardReaderOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17f, 11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 8.5f)
                moveTo(8.25f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(8.25f)
                curveTo(9.91f, 16f, 10.75f, 12.66f, 10.75f, 11f)
                reflectiveCurveTo(9.91f, 6f, 8.25f, 6f)
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                moveTo(23f, 22f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 21f)
                close()
            }
        }.build()

        return _SmartCardReaderOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SmartCardReaderOutline: ImageVector? = null
