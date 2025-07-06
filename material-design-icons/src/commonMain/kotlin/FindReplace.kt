package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FindReplace: ImageVector
    get() {
        if (_FindReplace != null) {
            return _FindReplace!!
        }
        _FindReplace = ImageVector.Builder(
            name = "FindReplace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                curveTo(12.38f, 6f, 13.63f, 6.56f, 14.54f, 7.46f)
                lineTo(12f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                lineTo(15.95f, 6.05f)
                curveTo(14.68f, 4.78f, 12.93f, 4f, 11f, 4f)
                curveTo(7.47f, 4f, 4.57f, 6.61f, 4.08f, 10f)
                horizontalLineTo(6.1f)
                curveTo(6.56f, 7.72f, 8.58f, 6f, 11f, 6f)
                moveTo(16.64f, 15.14f)
                curveTo(17.3f, 14.24f, 17.76f, 13.17f, 17.92f, 12f)
                horizontalLineTo(15.9f)
                curveTo(15.44f, 14.28f, 13.42f, 16f, 11f, 16f)
                curveTo(9.62f, 16f, 8.37f, 15.44f, 7.46f, 14.54f)
                lineTo(10f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                lineTo(6.05f, 15.95f)
                curveTo(7.32f, 17.22f, 9.07f, 18f, 11f, 18f)
                curveTo(12.55f, 18f, 14f, 17.5f, 15.14f, 16.64f)
                lineTo(20f, 21.5f)
                lineTo(21.5f, 20f)
                lineTo(16.64f, 15.14f)
                close()
            }
        }.build()

        return _FindReplace!!
    }

@Suppress("ObjectPropertyName")
private var _FindReplace: ImageVector? = null
