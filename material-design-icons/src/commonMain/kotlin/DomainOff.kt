package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DomainOff: ImageVector
    get() {
        if (_DomainOff != null) {
            return _DomainOff!!
        }
        _DomainOff = ImageVector.Builder(
            name = "DomainOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                horizontalLineTo(16f)
                lineTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                moveTo(10f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                moveTo(10f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                moveTo(6f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                moveTo(6f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                moveTo(6f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                moveTo(1.31f, 1.78f)
                lineTo(22.31f, 22.69f)
                lineTo(21f, 24f)
                lineTo(18f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                lineTo(0.09f, 3.09f)
                lineTo(1.31f, 1.78f)
                moveTo(16f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(8f, 5f)
                verticalLineTo(5.91f)
                lineTo(5.11f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(19.92f)
                lineTo(20f, 17.91f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(9.89f)
                lineTo(9.09f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _DomainOff!!
    }

@Suppress("ObjectPropertyName")
private var _DomainOff: ImageVector? = null
