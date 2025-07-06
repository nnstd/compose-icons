package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RaspberryPi: ImageVector
    get() {
        if (_RaspberryPi != null) {
            return _RaspberryPi!!
        }
        _RaspberryPi = ImageVector.Builder(
            name = "RaspberryPi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(4f, 5f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5f)
                moveTo(19f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                moveTo(13f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                moveTo(5f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                moveTo(7f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                moveTo(9f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                moveTo(11f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(13f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                moveTo(15f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                moveTo(20f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _RaspberryPi!!
    }

@Suppress("ObjectPropertyName")
private var _RaspberryPi: ImageVector? = null
