package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarShiftPattern: ImageVector
    get() {
        if (_CarShiftPattern != null) {
            return _CarShiftPattern!!
        }
        _CarShiftPattern = ImageVector.Builder(
            name = "CarShiftPattern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                moveTo(4f, 22f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                moveTo(14f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                moveTo(10f, 22f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                moveTo(16f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                moveTo(17f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CarShiftPattern!!
    }

@Suppress("ObjectPropertyName")
private var _CarShiftPattern: ImageVector? = null
