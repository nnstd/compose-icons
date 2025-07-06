package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeGroup: ImageVector
    get() {
        if (_HomeGroup != null) {
            return _HomeGroup!!
        }
        _HomeGroup = ImageVector.Builder(
            name = "HomeGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                lineTo(10f, 10f)
                lineTo(17f, 16f)
                moveTo(6f, 2f)
                lineTo(10f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                lineTo(6f, 2f)
                moveTo(18f, 3f)
                lineTo(23f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(15.34f)
                lineTo(14f, 10.87f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                lineTo(18f, 3f)
                close()
            }
        }.build()

        return _HomeGroup!!
    }

@Suppress("ObjectPropertyName")
private var _HomeGroup: ImageVector? = null
