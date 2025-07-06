package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterMultiple: ImageVector
    get() {
        if (_FilterMultiple != null) {
            return _FilterMultiple!!
        }
        _FilterMultiple = ImageVector.Builder(
            name = "FilterMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.46f, 5f)
                curveTo(3.25f, 5f, 3.04f, 5.08f, 2.87f, 5.21f)
                curveTo(2.43f, 5.55f, 2.35f, 6.18f, 2.69f, 6.61f)
                lineTo(2.69f, 6.62f)
                lineTo(8f, 13.42f)
                verticalLineTo(19.41f)
                lineTo(10.29f, 21.71f)
                curveTo(10.68f, 22.1f, 11.32f, 22.1f, 11.71f, 21.71f)
                curveTo(12.1f, 21.32f, 12.1f, 20.68f, 11.71f, 20.29f)
                lineTo(10f, 18.59f)
                verticalLineTo(12.73f)
                lineTo(4.27f, 5.39f)
                curveTo(4.08f, 5.14f, 3.78f, 5f, 3.46f, 5f)
                moveTo(16f, 12f)
                verticalLineTo(19.88f)
                curveTo(16.04f, 20.18f, 15.94f, 20.5f, 15.71f, 20.71f)
                curveTo(15.32f, 21.1f, 14.69f, 21.1f, 14.3f, 20.71f)
                lineTo(12.29f, 18.7f)
                curveTo(12.06f, 18.47f, 11.96f, 18.16f, 12f, 17.87f)
                verticalLineTo(12f)
                horizontalLineTo(11.97f)
                lineTo(6.21f, 4.62f)
                curveTo(5.87f, 4.19f, 5.95f, 3.56f, 6.38f, 3.22f)
                curveTo(6.57f, 3.08f, 6.78f, 3f, 7f, 3f)
                horizontalLineTo(21f)
                curveTo(21.22f, 3f, 21.43f, 3.08f, 21.62f, 3.22f)
                curveTo(22.05f, 3.56f, 22.13f, 4.19f, 21.79f, 4.62f)
                lineTo(16.03f, 12f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _FilterMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FilterMultiple: ImageVector? = null
