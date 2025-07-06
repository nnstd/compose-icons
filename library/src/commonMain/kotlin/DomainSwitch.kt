package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DomainSwitch: ImageVector
    get() {
        if (_DomainSwitch != null) {
            return _DomainSwitch!!
        }
        _DomainSwitch = ImageVector.Builder(
            name = "DomainSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                moveTo(22f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                moveTo(20f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                moveTo(8f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                moveTo(8f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(8f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                moveTo(4f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(4f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(4f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                moveTo(9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18f, 20f)
                lineTo(15f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                lineTo(6f, 20f)
                lineTo(9f, 17f)
                close()
            }
        }.build()

        return _DomainSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _DomainSwitch: ImageVector? = null
