package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bridge: ImageVector
    get() {
        if (_Bridge != null) {
            return _Bridge!!
        }
        _Bridge = ImageVector.Builder(
            name = "Bridge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                verticalLineTo(10.91f)
                curveTo(6.28f, 10.58f, 5.61f, 10.18f, 5f, 9.71f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                moveTo(5f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(1f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(8.43f)
                curveTo(6.8f, 10f, 9.27f, 11f, 12f, 11f)
                curveTo(14.73f, 11f, 17.2f, 10f, 19f, 8.43f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(23f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                moveTo(17f, 10.91f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(9.71f)
                curveTo(18.39f, 10.18f, 17.72f, 10.58f, 17f, 10.91f)
                moveTo(16f, 14f)
                verticalLineTo(11.32f)
                curveTo(15.36f, 11.55f, 14.69f, 11.72f, 14f, 11.84f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                moveTo(13f, 14f)
                verticalLineTo(11.96f)
                lineTo(12f, 12f)
                lineTo(11f, 11.96f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                moveTo(10f, 14f)
                verticalLineTo(11.84f)
                curveTo(9.31f, 11.72f, 8.64f, 11.55f, 8f, 11.32f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Bridge!!
    }

@Suppress("ObjectPropertyName")
private var _Bridge: ImageVector? = null
