package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlayProtectedContent: ImageVector
    get() {
        if (_PlayProtectedContent != null) {
            return _PlayProtectedContent!!
        }
        _PlayProtectedContent = ImageVector.Builder(
            name = "PlayProtectedContent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                moveTo(9f, 9f)
                verticalLineTo(14f)
                lineTo(12.5f, 11.5f)
                lineTo(9f, 9f)
                moveTo(21.04f, 11.67f)
                lineTo(16.09f, 16.62f)
                lineTo(13.96f, 14.5f)
                lineTo(12.55f, 15.91f)
                lineTo(16.09f, 19.45f)
                lineTo(22.45f, 13.09f)
                lineTo(21.04f, 11.67f)
                close()
            }
        }.build()

        return _PlayProtectedContent!!
    }

@Suppress("ObjectPropertyName")
private var _PlayProtectedContent: ImageVector? = null
