package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sword: ImageVector
    get() {
        if (_Sword != null) {
            return _Sword!!
        }
        _Sword = ImageVector.Builder(
            name = "Sword",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.92f, 5f)
                horizontalLineTo(5f)
                lineTo(14f, 14f)
                lineTo(15f, 13.06f)
                moveTo(19.96f, 19.12f)
                lineTo(19.12f, 19.96f)
                curveTo(18.73f, 20.35f, 18.1f, 20.35f, 17.71f, 19.96f)
                lineTo(14.59f, 16.84f)
                lineTo(11.91f, 19.5f)
                lineTo(10.5f, 18.09f)
                lineTo(11.92f, 16.67f)
                lineTo(3f, 7.75f)
                verticalLineTo(3f)
                horizontalLineTo(7.75f)
                lineTo(16.67f, 11.92f)
                lineTo(18.09f, 10.5f)
                lineTo(19.5f, 11.91f)
                lineTo(16.83f, 14.58f)
                lineTo(19.95f, 17.7f)
                curveTo(20.35f, 18.1f, 20.35f, 18.73f, 19.96f, 19.12f)
                close()
            }
        }.build()

        return _Sword!!
    }

@Suppress("ObjectPropertyName")
private var _Sword: ImageVector? = null
