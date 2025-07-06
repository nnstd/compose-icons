package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageAlertOutline: ImageVector
    get() {
        if (_MessageAlertOutline != null) {
            return _MessageAlertOutline!!
        }
        _MessageAlertOutline = ImageVector.Builder(
            name = "MessageAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                moveTo(13f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                moveTo(22f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(17.2f)
                lineTo(5.2f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MessageAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageAlertOutline: ImageVector? = null
