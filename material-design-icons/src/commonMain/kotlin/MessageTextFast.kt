package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageTextFast: ImageVector
    get() {
        if (_MessageTextFast != null) {
            return _MessageTextFast!!
        }
        _MessageTextFast = ImageVector.Builder(
            name = "MessageTextFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                curveTo(7.9f, 5f, 7f, 5.9f, 7f, 7f)
                verticalLineTo(21f)
                lineTo(11f, 17f)
                horizontalLineTo(20f)
                curveTo(21.1f, 17f, 22f, 16.1f, 22f, 15f)
                verticalLineTo(7f)
                curveTo(22f, 5.9f, 21.1f, 5f, 20f, 5f)
                horizontalLineTo(9f)
                moveTo(3f, 7f)
                curveTo(2.4f, 7f, 2f, 7.4f, 2f, 8f)
                reflectiveCurveTo(2.4f, 9f, 3f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(11f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(2f, 11f)
                curveTo(1.4f, 11f, 1f, 11.4f, 1f, 12f)
                reflectiveCurveTo(1.4f, 13f, 2f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                moveTo(11f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                moveTo(1f, 15f)
                curveTo(0.4f, 15f, 0f, 15.4f, 0f, 16f)
                curveTo(0f, 16.6f, 0.4f, 17f, 1f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                close()
            }
        }.build()

        return _MessageTextFast!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTextFast: ImageVector? = null
