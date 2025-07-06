package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Translate: ImageVector
    get() {
        if (_Translate != null) {
            return _Translate!!
        }
        _Translate = ImageVector.Builder(
            name = "Translate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.87f, 15.07f)
                lineTo(10.33f, 12.56f)
                lineTo(10.36f, 12.53f)
                curveTo(12.1f, 10.59f, 13.34f, 8.36f, 14.07f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                horizontalLineTo(12.17f)
                curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9f, 11.35f)
                curveTo(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8f)
                horizontalLineTo(4.69f)
                curveTo(5.42f, 9.63f, 6.42f, 11.17f, 7.67f, 12.56f)
                lineTo(2.58f, 17.58f)
                lineTo(4f, 19f)
                lineTo(9f, 14f)
                lineTo(12.11f, 17.11f)
                lineTo(12.87f, 15.07f)
                moveTo(18.5f, 10f)
                horizontalLineTo(16.5f)
                lineTo(12f, 22f)
                horizontalLineTo(14f)
                lineTo(15.12f, 19f)
                horizontalLineTo(19.87f)
                lineTo(21f, 22f)
                horizontalLineTo(23f)
                lineTo(18.5f, 10f)
                moveTo(15.88f, 17f)
                lineTo(17.5f, 12.67f)
                lineTo(19.12f, 17f)
                horizontalLineTo(15.88f)
                close()
            }
        }.build()

        return _Translate!!
    }

@Suppress("ObjectPropertyName")
private var _Translate: ImageVector? = null
