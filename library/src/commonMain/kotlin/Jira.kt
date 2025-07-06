package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Jira: ImageVector
    get() {
        if (_Jira != null) {
            return _Jira!!
        }
        _Jira = ImageVector.Builder(
            name = "Jira",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.53f, 2f)
                curveTo(11.53f, 4.4f, 13.5f, 6.35f, 15.88f, 6.35f)
                horizontalLineTo(17.66f)
                verticalLineTo(8.05f)
                curveTo(17.66f, 10.45f, 19.6f, 12.39f, 22f, 12.4f)
                verticalLineTo(2.84f)
                arcTo(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.16f, 2f)
                horizontalLineTo(11.53f)
                moveTo(6.77f, 6.8f)
                curveTo(6.78f, 9.19f, 8.72f, 11.13f, 11.11f, 11.14f)
                horizontalLineTo(12.91f)
                verticalLineTo(12.86f)
                curveTo(12.92f, 15.25f, 14.86f, 17.19f, 17.25f, 17.2f)
                verticalLineTo(7.63f)
                curveTo(17.24f, 7.17f, 16.88f, 6.81f, 16.42f, 6.8f)
                horizontalLineTo(6.77f)
                moveTo(2f, 11.6f)
                curveTo(2f, 14f, 3.95f, 15.94f, 6.35f, 15.94f)
                horizontalLineTo(8.13f)
                verticalLineTo(17.66f)
                curveTo(8.14f, 20.05f, 10.08f, 22f, 12.47f, 22f)
                verticalLineTo(12.43f)
                arcTo(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.63f, 11.59f)
                lineTo(2f, 11.6f)
                close()
            }
        }.build()

        return _Jira!!
    }

@Suppress("ObjectPropertyName")
private var _Jira: ImageVector? = null
