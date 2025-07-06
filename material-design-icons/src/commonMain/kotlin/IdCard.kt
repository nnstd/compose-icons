package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IdCard: ImageVector
    get() {
        if (_IdCard != null) {
            return _IdCard!!
        }
        _IdCard = ImageVector.Builder(
            name = "IdCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.89f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(4f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                moveTo(10f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                moveTo(4f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                moveTo(16f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _IdCard!!
    }

@Suppress("ObjectPropertyName")
private var _IdCard: ImageVector? = null
