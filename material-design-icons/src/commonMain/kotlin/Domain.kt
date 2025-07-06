package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Domain: ImageVector
    get() {
        if (_Domain != null) {
            return _Domain!!
        }
        _Domain = ImageVector.Builder(
            name = "Domain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                moveTo(18f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                moveTo(20f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                moveTo(10f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                moveTo(10f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                moveTo(6f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(6f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                moveTo(12f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _Domain!!
    }

@Suppress("ObjectPropertyName")
private var _Domain: ImageVector? = null
