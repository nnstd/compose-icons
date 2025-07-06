package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneIncomingOutgoing: ImageVector
    get() {
        if (_PhoneIncomingOutgoing != null) {
            return _PhoneIncomingOutgoing!!
        }
        _PhoneIncomingOutgoing = ImageVector.Builder(
            name = "PhoneIncomingOutgoing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17.5f)
                verticalLineTo(21f)
                curveTo(20f, 21.55f, 19.55f, 22f, 19f, 22f)
                curveTo(9.61f, 22f, 2f, 14.39f, 2f, 5f)
                curveTo(2f, 4.45f, 2.45f, 4f, 3f, 4f)
                horizontalLineTo(6.5f)
                curveTo(7.05f, 4f, 7.5f, 4.45f, 7.5f, 5f)
                curveTo(7.5f, 6.25f, 7.7f, 7.45f, 8.07f, 8.57f)
                curveTo(8.18f, 8.92f, 8.1f, 9.31f, 7.82f, 9.57f)
                lineTo(5.62f, 11.78f)
                curveTo(7.06f, 14.62f, 9.38f, 16.93f, 12.21f, 18.37f)
                lineTo(14.41f, 16.17f)
                curveTo(14.69f, 15.9f, 15.08f, 15.82f, 15.43f, 15.93f)
                curveTo(16.55f, 16.3f, 17.75f, 16.5f, 19f, 16.5f)
                curveTo(19.55f, 16.5f, 20f, 16.95f, 20f, 17.5f)
                moveTo(16f, 7.5f)
                horizontalLineTo(12.5f)
                lineTo(18f, 2f)
                lineTo(17f, 1f)
                lineTo(11.5f, 6.5f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7.5f)
                moveTo(17f, 6f)
                verticalLineTo(7.5f)
                horizontalLineTo(20.5f)
                lineTo(15f, 13f)
                lineTo(16f, 14f)
                lineTo(21.5f, 8.5f)
                verticalLineTo(12f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PhoneIncomingOutgoing!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneIncomingOutgoing: ImageVector? = null
