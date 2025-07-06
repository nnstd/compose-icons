package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Factory: ImageVector
    get() {
        if (_Factory != null) {
            return _Factory!!
        }
        _Factory = ImageVector.Builder(
            name = "Factory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                moveTo(4f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                moveTo(10f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(16f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                moveTo(16f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                moveTo(2f, 22f)
                verticalLineTo(8f)
                lineTo(7f, 12f)
                verticalLineTo(8f)
                lineTo(12f, 12f)
                verticalLineTo(8f)
                lineTo(17f, 12f)
                lineTo(18f, 2f)
                horizontalLineTo(21f)
                lineTo(22f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Factory!!
    }

@Suppress("ObjectPropertyName")
private var _Factory: ImageVector? = null
