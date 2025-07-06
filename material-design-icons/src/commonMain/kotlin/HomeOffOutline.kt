package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeOffOutline: ImageVector
    get() {
        if (_HomeOffOutline != null) {
            return _HomeOffOutline!!
        }
        _HomeOffOutline = ImageVector.Builder(
            name = "HomeOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.27f, 8.16f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(12.11f)
                lineTo(13f, 14.89f)
                verticalLineTo(20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(10.19f)
                lineTo(7.68f, 9.57f)
                lineTo(10.11f, 12f)
                horizontalLineTo(9f)
                moveTo(15f, 18f)
                verticalLineTo(16.89f)
                lineTo(16.11f, 18f)
                horizontalLineTo(15f)
                moveTo(10.36f, 7.16f)
                lineTo(8.95f, 5.75f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(17f, 13.8f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
                lineTo(10.36f, 7.16f)
                close()
            }
        }.build()

        return _HomeOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeOffOutline: ImageVector? = null
